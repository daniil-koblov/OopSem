package OopSem5.personal;

import OopSem5.personal.controllers.UserController;
import OopSem5.personal.model.FileOperation;
import OopSem5.personal.model.FileOperationImpl;
import OopSem5.personal.model.Repository;
import OopSem5.personal.model.RepositoryFile;
import OopSem5.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
