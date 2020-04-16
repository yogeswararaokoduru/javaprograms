import java.util.Objects;
import java.util.UUID;

public class Employee {
    private String id;
    private String nmae;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(nmae, employee.nmae) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        String ds=UUID.randomUUID().toString();
        return Objects.hash("1", "12", ds);
    }
}
