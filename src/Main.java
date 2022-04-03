import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Engenharia;
import br.com.dio.desafio.dominio.Materia;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Engenharia Civil");
        curso1.setDescricao("descrição curso Engenharia Civil");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Engenharia Produçao");
        curso2.setDescricao("descrição curso Engenharia Produçao");
        curso2.setCargaHoraria(4);

        Materia materia = new Materia();
        materia.setTitulo("materia de calculo");
        materia.setDescricao("descrição materia de calculo");
        materia.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Engenharia engenharia = new Engenharia();
        engenharia.setNome("Engenharia de Produção");
        engenharia.setDescricao("Descrição Engenharia de Produção");
        engenharia.getConteudos().add(curso1);
        engenharia.getConteudos().add(curso2);
        engenharia.getConteudos().add(materia);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverEngenharia(engenharia);
        System.out.println("Conteúdos Ministrado Rodrigo:" + devRodrigo.getConteudosMinistrado());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Ministrado Rodrigo:" + devRodrigo.getConteudosMinistrado());
        System.out.println("Conteúdos Ministrado Rodrigo:" + devRodrigo.getConteudosConcluidos());
        System.out.println("NotaFinal:" + devRodrigo.calcularNotaFinal());

        System.out.println("-------");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverEngenharia(engenharia);
        System.out.println("Conteúdos Ministrado Paula:" + devRodrigo.getConteudosMinistrado());
        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Ministrado Paula:" + devPaula.getConteudosMinistrado());
        System.out.println("Conteúdos Ministrado Paula:" + devPaula.getConteudosConcluidos());
        System.out.println("NotaFinal:" + devPaula.calcularNotaFinal());

    }

}