package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso Js");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso Java");
        curso2.setDescricao("descricao curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("XP" + devCamila.calcularTotalXp());

        System.out.println(".........................");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP" + devCamila.calcularTotalXp());
    }


}
