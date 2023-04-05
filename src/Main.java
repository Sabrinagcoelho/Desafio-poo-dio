import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSabrina = new Dev();
        devSabrina.setNome("Sabrina");
        devSabrina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sabrina:" + devSabrina.getConteudosInscritos());
        devSabrina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sabrina:" + devSabrina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Sabrina:" + devSabrina.getConteudosConcluidos());
        System.out.println("XP:" + devSabrina.calcularTotalXp());

        System.out.println("-------");

        Dev devLucas = new Dev();
        devLucas.inscreverBootcamp(bootcamp);
        devLucas.setNome("Lucas");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devSabrina.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());
    }
}