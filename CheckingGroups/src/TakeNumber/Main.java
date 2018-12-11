package TakeNumber;

public class Main {

    public static void main(String[] args) {
	CheckingGroups.groupCheck("{{(())}}");
        System.out.println(CheckingGroups.groupCheck("{{s(())s}}"));
    }
}
