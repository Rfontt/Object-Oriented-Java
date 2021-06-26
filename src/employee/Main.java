package employee;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Shadow");
        manager.setSalary(6300);

        InternalSystem internalSystem = new InternalSystem();
        internalSystem.authenticate(manager);

        Client client = new Client();
        client.setPassword(2222);
        boolean authenticated = client.authenticate(2222);
        internalSystem.authenticate(client);

        BonusControl control = new BonusControl();
        control.register(manager);

        System.out.println(control.getSum());

        Programmer programmer = new Programmer();
        programmer.setSalary(6300);

        BonusControl programmerControl = new BonusControl();
        programmerControl.register(programmer);

        System.out.println(programmerControl.getSum());
    }
}
