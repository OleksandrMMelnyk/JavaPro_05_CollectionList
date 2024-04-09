package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Record> records;

    public PhoneBook() {
        records = new ArrayList<>();
    }

    public void add(Record newRecord) {
        records.add(newRecord);
    }

    public Record find(String name) {
        for (Record currentRecord : records) {
            if (currentRecord.getName().equals(name))
                return currentRecord;
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record currentRecord : records) {
            if (currentRecord.getName().equals(name)) {
                foundRecords.add(currentRecord);
            }
        }
        return foundRecords.isEmpty() ? null : foundRecords;
    }
}

