package site.metacoding.animalprojectfrontend.web.api.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import site.metacoding.animalprojectfrontend.domain.user.User;
=======
>>>>>>> fb00b36902b41162eae1f5fb9b170ac49922f8c4

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JoinDto {
    private String username;
    private String password;
    private String email;
    private String male;
<<<<<<< HEAD
    private String addr;

    public User toEntity() {
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(this.password);
        user.setEmail(this.email);
        user.setMale(this.male);
        user.setAddr(this.addr);
        return user;
    }
=======
>>>>>>> fb00b36902b41162eae1f5fb9b170ac49922f8c4
}
