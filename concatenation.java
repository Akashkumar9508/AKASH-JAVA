class aniruddh {
    public static void main(String[] args) {
        String firstName = "tony";
        String lastName = "stark";
        String fullNmae = firstName + " " + lastName;

        System.out.println(fullNmae.length());
        for (int i = 0; i < fullNmae.length(); i++) {
            System.out.println(fullNmae.charAt(i));
        }
    }
}