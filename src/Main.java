import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Técnico em informática", "Curso técnico em informática para alunos com ensino médio completo", 1200);
        System.out.println(curso1.informacoes());

        Curso curso2 = new Curso("Tecnólogo em Hotelaria", "Curso na aréa da hotelaria para alunos que obtiveram boa nota no ENEM", 1800);
        System.out.println(curso2.informacoes());

        Mentoria mentoria = new Mentoria("Mentoria em POO", "Mentoria sobre os pilares em POO", LocalDate.now());
        System.out.println(mentoria.informacoes());
    }
}
