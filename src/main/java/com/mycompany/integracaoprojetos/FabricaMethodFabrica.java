/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integracaoprojetos;

/**
 *
 * @author PICHAU
 */
public class FabricaMethodFabrica {

    private static FabricaMethodFabrica instancia;

    private FabricaMethodFabrica() {
    }

    public static FabricaMethodFabrica getInstancia() {
        if (instancia == null) {
            instancia = new FabricaMethodFabrica();
        }

        return instancia;
    }

    public FabricaAbstrata criarFabrica(String tipoCliente) {

        if (tipoCliente.equalsIgnoreCase("PF")) {
            return new FabricaPF();

        } else if (tipoCliente.equalsIgnoreCase("PJ")) {
            return new FabricaPJ();
        }

        return null;
    }
}