import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RegistrationInfo {
    private final String city;
    private final String name;
    private final String phone;
}

