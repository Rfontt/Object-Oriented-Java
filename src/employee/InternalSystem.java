package employee;

public class InternalSystem {
    private int password = 2222;

    public void authenticate(AuthenticatedEmployee userAllowed) {
        boolean authenticated = userAllowed.authenticate(this.password);

        if(authenticated) {
            System.out.println("User allowed");
        }else {
            System.out.println("User not allowed");
        }
    }
}
