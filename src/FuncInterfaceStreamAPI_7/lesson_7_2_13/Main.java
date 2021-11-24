package FuncInterfaceStreamAPI_7.lesson_7_2_13;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Random variables
        String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

        // Создание списка из трех почтовых сообщений.
        StreamsMail.MailMessage firstMessage = new StreamsMail.MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";

        StreamsMail.MailMessage secondMessage = new StreamsMail.MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        StreamsMail.MailMessage thirdMessage = new StreamsMail.MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<StreamsMail.MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );

        // Создание почтового сервиса.
        StreamsMail.MailService<String> mailService = new StreamsMail.MailService<>();

        // Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService);

        //Получение и проверка словаря "почтового ящика",
        //где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox();

        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ): "wrong mailService mailbox content (1)";

        System.out.println(mailBox.get("Christopher Nolan"));

        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ): "wrong mailService mailbox content (2)";

        assert mailBox.get(randomTo).equals(java.util.Collections.<String>emptyList()): "wrong mailService mailbox content (3)";

        // Создание списка из трех зарплат.
        StreamsMail.Salary salary1 = new StreamsMail.Salary("Facebook", "Mark Zuckerberg", 1);
        StreamsMail.Salary salary2 = new StreamsMail.Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        StreamsMail.Salary salary3 = new StreamsMail.Salary(randomFrom, randomTo, randomSalary);

        // Создание почтового сервиса, обрабатывающего зарплаты.
        StreamsMail.MailService<Integer> salaryService = new StreamsMail.MailService<>();

        // Обработка списка зарплат почтовым сервисом
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

        // Получение и проверка словаря "почтового ящика",
        //   где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        System.out.println(salaries.get(salary1.getTo()));
        System.out.println(Arrays.asList(1));
        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)): "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";
    }
    public static class StreamsMail {

        public interface Sendable<T>{
            String getTo();
            T getContent();
        }

        public static class MailMessage implements Sendable<String> {
            private String from;
            private String to;
            private String content;

            public String getFrom(){
                return from;
            }

            public MailMessage (String From, String To, String Content){
                this.from = From;
                this.to = To;
                this.content = Content;
            }

            @Override
            public String getTo(){
                return to;
            }
            @Override
            public String getContent(){
                return content;
            }
        }


        public static class Salary implements Sendable<Integer> {
            private String job;
            private String name;
            private Integer salary;

            public Salary(String Job, String Name, Integer Salary){
                this.job = Job;
                this.name = Name;
                this.salary = Salary;
            }
            @Override
            public String getTo(){
                return name;
            }

            @Override
            public Integer getContent() {
                return salary;
            }
        }

        public static class MailService<T> implements Consumer<Sendable<T>> {
            Map<String, List<T>> msMailBox =  new HashMap<String, List<T>>() {
                @Override
                public List<T> get(Object key) {
//                        if (msMailBox.containsKey(key)) {
//                            return msMailBox.getOrDefault(key, null);
//                        } else {
//                            List<T> list = new LinkedList<>();
//                            msMailBox.put((String)key, list);
//                            return list;
//                        }
                    return super.getOrDefault(key, new LinkedList<>());
                }
            };
            public Map<String, List<T>> getMailBox(){
                return msMailBox;
            }

            @Override
            public void accept(Sendable<T> t) {
//                List list = msMailBox.get(t.getTo());
//                list.add(t.getContent());
                List<T> list = new LinkedList<>();
                if (msMailBox.containsKey(t.getTo())) {
                    list = msMailBox.get(t.getTo());
                    list.add(t.getContent());
                } else {
                    list.add(t.getContent());
                    msMailBox.put(t.getTo(), list);
                }
            }
        }
    }
}
