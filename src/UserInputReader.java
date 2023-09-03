import Exeptions.UserDataException;

public interface UserInputReader {
    UserData readUserData() throws UserDataException;
}
