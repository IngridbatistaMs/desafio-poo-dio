import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Técnico em informática");
        curso1.setDescricao("Curso para técnico em informática");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Tecnólogo em Hotelaria");
        curso2.setDescricao("Curso na aréa da hotelaria para alunos que obtiveram boa nota no ENEM");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em POO");
        mentoria.setDescricao("Mentoria sobre os pilares em POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander");
        bootcamp.setDescricao("Bootcamp proporcionado pela DIO em parceria com o Santander");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devIngrid = new Dev();
        devIngrid.setNome("Ingrid");
        devIngrid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ingrid:" + devIngrid.getConteudosInscritos());
        System.out.println("**");

        devIngrid.progredir();
        System.out.println("Conteúdos Inscritos Ingrid:" + devIngrid.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ingrid:" + devIngrid.getConteudosConcluidos());
        System.out.println("XP:" + devIngrid.calcularTotalXP());

        System.out.println("-------");

        Dev devRomulo = new Dev();
        devRomulo.setNome("Joao");
        devRomulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rômulo:" + devRomulo.getConteudosInscritos());
        System.out.println("**");

        devRomulo.progredir();
        System.out.println("Conteúdos Inscritos Rômulo:" + devRomulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rômulo:" + devRomulo.getConteudosConcluidos());
        System.out.println("XP:" + devRomulo.calcularTotalXP());

    }

    }

