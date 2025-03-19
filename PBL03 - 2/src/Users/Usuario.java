package Users;

public class Usuario {
    public String nome;
    public String senha;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

//    public void setSenha(String senha){
//        this.senha = senha;
//    }
//
//    public String getSenha(){
//        return senha;
//    }

    public boolean validarSenha(String senha){
        if(this.senha.equals(senha)){
            return true;
        }
        return false;
    }

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
}
