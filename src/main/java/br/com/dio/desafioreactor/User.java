package br.com.dio.desafioreactor;

public record User(Long id,
                   String name,
                   String email,
                   String password,
                   Boolean isAdmin) {
    @Override
    public Boolean isAdmin() {
        return isAdmin;
    }

    public String getPassword(){
        return password;
    }
}
