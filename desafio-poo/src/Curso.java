
public class Curso extends Conteudo{

    
    private int cargaHoraria;

    @Override
    public double calcularXp() {
       return XP_PADRAO * cargaHoraria;
    }

    public Curso (){}
   

    public int getcargaHoraria() {
        return cargaHoraria;

    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    

    
    

    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


   
    


}