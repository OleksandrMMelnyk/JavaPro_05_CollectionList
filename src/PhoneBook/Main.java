package PhoneBook;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PhoneBook globalPhoneBook = new PhoneBook();

        globalPhoneBook.add(new Record("Iryna", "+380639876543"));
        globalPhoneBook.add(new Record("Anton", "+380671234567"));
        globalPhoneBook.add(new Record("Olena", "+380984563215"));
        globalPhoneBook.add(new Record("Vasyl", "+380509632587"));
        globalPhoneBook.add(new Record("Olga", "+380681597532"));

        Record foundRecord = globalPhoneBook.find("Olena");
        if (foundRecord != null) {
            System.out.println("Record: " + "\n" + foundRecord.getPhoneNumber() + " - " + foundRecord.getName());
        } else {
            System.out.println("No records!");
        }

        List<Record> foundRecords = globalPhoneBook.findAll("Olena");
        if (foundRecords != null) {
            System.out.println("All records for " + foundRecords.getFirst().getName() + ":");
            for (Record currentRecord : foundRecords) {
                System.out.println(currentRecord.getPhoneNumber() + " - " + currentRecord.getName());
            }
        } else
            System.out.println("No records!");
    }
}
