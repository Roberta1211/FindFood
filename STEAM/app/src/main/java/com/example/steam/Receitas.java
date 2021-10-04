package com.example.steam;

public class Receitas {
        String nome;
        String restaurante;


        public Receitas(String nome, String restaurante) {
            this.nome = nome;
            this.restaurante = restaurante;
        }

    public Receitas() {

    }

    public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRestaurante() {
            return restaurante;
        }

        public void setRestaurante(String restaurante) {
            this.restaurante = restaurante;
        }


    }


