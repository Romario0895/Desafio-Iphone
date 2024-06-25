public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = (ReprodutorMusical) new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

     
        meuiPhone.getReprodutorMusical().selecionarMusica("Stairway to Heaven");
        meuiPhone.getReprodutorMusical().tocar();
        meuiPhone.getReprodutorMusical().pausar();

       
        meuiPhone.getAparelhoTelefonico().ligar("123456789");
        meuiPhone.getAparelhoTelefonico().atender();
        meuiPhone.getAparelhoTelefonico().iniciarCorreiodeVoz();

        
        meuiPhone.getNavegadorInternet().exibirPagina("https://www.apple.com");
        meuiPhone.getNavegadorInternet().adicionarNovaAba();
        meuiPhone.getNavegadorInternet().atualizarPagina();
    }
}
