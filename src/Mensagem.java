public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            default:
                System.out.println("Relógio quebrado");

        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom Tarde");
    }

}
