import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("descrição curso java");
        curso1.setTitulo("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setDescricao("descrição curso javascript");
        curso2.setTitulo("curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("----Inicio-----");

        Dev devFabiola = new Dev();
        devFabiola.setNome("Fabiola");
        devFabiola.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fabíola: " + devFabiola.getConteudosInscritos());
        devFabiola.progredir();
        devFabiola.progredir();
        devFabiola.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fabíola: " + devFabiola.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Fabíola: " + devFabiola.getConteudosConcluidos());
        System.out.println("XP:" + devFabiola.calcularTotalXp());

        System.out.println("----------");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP:" + devBruno.calcularTotalXp());

    }
}