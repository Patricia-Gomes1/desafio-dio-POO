import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        /*
         * Conteudo conteudo = new Curso(); (conteudo é uma classe abstrata, é mãe de
         * curso)
         * Conteudo conteudo1 = new Mentoria(); (conteudo é uma classe abstrata, é mãe
         * de mentoria)
         */

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPatricia = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Patricia: " + devPatricia.getConteudosInscritos());
        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Patricia: " + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Patricia: " + devPatricia.getConteudosConcluidos());
        System.out.println("XP: " + devPatricia.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev devJoão = new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoão.getConteudosInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoão.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoão.getConteudosConcluidos());
        System.out.println("XP: " + devJoão.calcularTotalXp());

    }
}
