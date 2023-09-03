import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class UserDataFileWriterImpl implements UserDataFileWriter{
    @Override
    public void writeUserData(UserData userData) throws IOException {
        String fileName = userData.getLastName();
        FileWriter writer = new FileWriter(fileName, true);
        String userDataString = String.join(" ",
                userData.getLastName(),
                userData.getFirstName(),
                userData.getMiddleName(),
                userData.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                String.valueOf(userData.getPhoneNumber()),
                userData.getGender().toString());
        writer.write(userDataString + "\n");
        writer.close();
        System.out.println("Данные успешно записаны в файл: " +
                fileName);
    }
}
