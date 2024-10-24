package de_java_para_kotlin;

public class Cliente {
    private String email;
    private String nomeUsuario;

    public Cliente(String email, String nomeUsuario) {
        this.email = email;
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
