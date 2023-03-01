public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введіть кількість генерованих символів");
            return;
        }
        int count = Integer.parseInt(args[0]);
        for (int i = 0; i < count; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("голосна");
                    break;
                case 'y':
                case 'w':
                    System.out.println("іноді голосна");
                    break;
                default:
                    System.out.println("приголосна");
            }
        }
    }
}
