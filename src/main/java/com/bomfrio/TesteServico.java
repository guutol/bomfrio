package com.bomfrio;

import com.bomfrio.dao.ClienteDAO;
import com.bomfrio.dao.ServicoDAO;
import com.bomfrio.model.Cliente;
import com.bomfrio.model.Servico;

import java.time.LocalDate;

public class TesteServico {
    public static void main(String[] args) {
        Servico servico = new Servico(
            1, 
            "59576363802", 
            "Conserto", 
            "Câmara fria",
            "O cliente alegou que a câmara fria não está gelando normalmente", 
            "Cliente chato pra porra", 
            600.0, 
            LocalDate.now(), 
            "Em andamento");

            ServicoDAO dao = new ServicoDAO();
            boolean sucesso = dao.inserir(servico);

            if(sucesso) {
                System.out.println("Serviço inserido com sucesso!");
            }
            else {
                System.out.println("Falha ao inserir serviço.");
            }
    }
}
