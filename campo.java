public class Campo {
    private char disco;

    public Campo() {
        this.disco1 = ' ';
    }

    public char getDisco() {
        return this.disco1;
    }

    public void setCor(char disco1) {
        if (this.disco1 == ' ') {
            this.disco1 = disco1;
        } else {
            System.out.print("linha já está totalmente preenchida");
        }
    }
}