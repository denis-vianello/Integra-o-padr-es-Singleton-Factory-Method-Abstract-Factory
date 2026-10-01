/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integracaoprojetos;

/**
 *
 * @author PICHAU
 */
public class FabricaPF implements FabricaAbstrata {

    @Override
    public Contrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}
