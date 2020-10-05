package core.factories;

import core.models.dto.User;
import core.models.interfaces.IUser;

public class DtoFactory {
    public IUser CreateUser() {
        return new User();
    }
}
