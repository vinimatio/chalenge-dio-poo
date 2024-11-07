import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", "Java DIO", 8);
        Curso curso2 = new Curso("TypeScript", "TS DIO", 7);
        Mentoria mentoria1 = new Mentoria("SoftSkills", "Desenvolvimento Pessoal", LocalDate.now());

        BootCamp bootcamp = new BootCamp();

        bootcamp.setNome("DIO BOOT CAMP");
        bootcamp.setDescricao("BootCamp dos bons");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev("Vini");

        dev1.inscreverBootcamp(bootcamp);

        System.out.println(dev1.getConteudosInscritos());

    }

}