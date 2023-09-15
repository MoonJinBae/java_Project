package funProjects;

public class HandsOn {

    public static String[] getMembers() {
        String[] members = {"문진배", "김잔디", "문찬슬"};
        return members;
    }
    public static void main(String[] args) {
        String [] members = getMembers();
        for (String name:               // for-each문 사용
             members) {
            System.out.print(name + ", ");
        }
        System.out.println("입니다.");

        System.out.println("-----------");

        for (int i = 0; i < members.length; i++) {  // for-i문 사용
            System.out.print(members[i] + ", ");
        }
        System.out.println("입니다.");
    }
}

