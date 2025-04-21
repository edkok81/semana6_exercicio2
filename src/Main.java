import java.util.ArrayList;

interface Midia {
    String play();
    String pause();
    String next();
    String previous();
}

class Musica implements Midia {
    private String nome;
    private String genero;

    public Musica(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String play() {
        return "Tocando a música: " + getNome() + ". Curta um " + getGenero() + "!";
    }

    public String pause() {
        return "Música " + getNome() + " pausada.";
    }

    public String next() {
        return "Toque mais uma vez para passar para a próxima música.";
    }

    public String previous() {
        return "Toque mais uma vez para voltar para a música anterior.";
    }
}

public class Main {
    public static void main(String[] args) {
        var musicas = new ArrayList<Musica>();

        musicas.add(new Musica("Ouro de Tolo", "Rock"));
        musicas.add(new Musica("All that I want", "Rock"));
        musicas.add(new Musica("Wildflower", "Pop"));

        for(Musica musica : musicas) {
            System.out.println(musica.play());
            System.out.println(musica.next());
            System.out.println(musica.previous());
            System.out.println(musica.pause());
            System.out.println();
        }
    }
}