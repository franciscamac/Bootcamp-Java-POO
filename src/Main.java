import dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFran = new Dev();
        devFran.setNome("Fran");
        devFran.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Fran: " + devFran.getConteudoInscritos());
        devFran.progredir();
        devFran.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Fran: " + devFran.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Fran: " + devFran.getConteudoConcluidos());
        System.out.println("XP:" + devFran.calcularTotalXp());

        System.out.println("----------------");

        Dev devOlga = new Dev();
        devOlga.setNome("Olga");
        devOlga.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Olga: " + devOlga.getConteudoInscritos());
        devOlga.progredir();
        devOlga.progredir();
        devOlga.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Olga: " + devOlga.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Olga: " + devFran.getConteudoConcluidos());
        System.out.println("XP:" + devOlga.calcularTotalXp());
    }

}