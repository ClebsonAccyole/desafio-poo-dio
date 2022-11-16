import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClebson = new Dev();
        devClebson.setNome("Clebson");
        devClebson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devClebson.getConteudosInscritos());
        devClebson.progredir();
        devClebson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Clebson" + devClebson.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Clebson" + devClebson.getConteudosConcluidos());
        System.out.println("XP!" + devClebson.calcularTotalXp());

        System.out.println("_____________________________________________________");

        Dev devAndrews = new Dev();
        devClebson.setNome("Andrews");
        devAndrews.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAndrews.getConteudosInscritos());
        devAndrews.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Andrews" + devAndrews.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Andrews" + devAndrews.getConteudosConcluidos());
        System.out.println("XP!" + devAndrews.calcularTotalXp());
    }
}
