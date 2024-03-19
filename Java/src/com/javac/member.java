package com.javac;

class Member 
{
    private String name;
    private String message;

    public Member(String name) {
        this.name = name;
        this.message = "";
    }

    public void sendMessage(Member receiver, String message) {
        receiver.receiveMessage(message);
    }

    private void receiveMessage(String message) {
        this.message = message;
        System.out.println(name + " received message: " + message);
    }

    public String getName() {
        return name;
    }
    
    public String getMessage() {
        return message;
    }
    public static void main(String[] args) {
        Member member1 = new Member("Member 1");
        Member member2 = new Member("Member 2");
        Member member3 = new Member("Member 3");
        Member member4 = new Member("Member 4");

        member1.sendMessage(member2, "Message from Member 1");
        member2.sendMessage(member3, member2.getMessage());
        member3.sendMessage(member4, member3.getMessage() + "Message from Member 3 ");
        member4.sendMessage(member1, member4.getMessage() + "Message from Member 4 ");
    }
}
