/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import com.mycompany.integracaoprojetos.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class IntegracaoTest {

@Test
public void testeSingleton() {

    FabricaMethodFabrica fabrica1 = FabricaMethodFabrica.getInstancia();
    FabricaMethodFabrica fabrica2 = FabricaMethodFabrica.getInstancia();

    assertSame(fabrica1, fabrica2);
}

@Test
public void testeFactoryMethodPF() {

    FabricaMethodFabrica fabrica = FabricaMethodFabrica.getInstancia();

    FabricaAbstrata fabricaPF = fabrica.criarFabrica("PF");

    assertInstanceOf(FabricaPF.class, fabricaPF);
}

@Test
public void testeFactoryMethodPJ() {

    FabricaMethodFabrica fabrica = FabricaMethodFabrica.getInstancia();

    FabricaAbstrata fabricaPJ = fabrica.criarFabrica("PJ");

    assertInstanceOf(FabricaPJ.class, fabricaPJ);
}

@Test
public void testeAbstractFactoryPF() {

    FabricaMethodFabrica fabrica = FabricaMethodFabrica.getInstancia();

    FabricaAbstrata fabricaPF = fabrica.criarFabrica("PF");

    Contrato contrato = fabricaPF.criarContrato();
    Procuracao procuracao = fabricaPF.criarProcuracao();

    assertInstanceOf(ContratoPF.class, contrato);
    assertInstanceOf(ProcuracaoPF.class, procuracao);
}

@Test
public void testeAbstractFactoryPJ() {

    FabricaMethodFabrica fabrica = FabricaMethodFabrica.getInstancia();

    FabricaAbstrata fabricaPJ = fabrica.criarFabrica("PJ");

    Contrato contrato = fabricaPJ.criarContrato();
    Procuracao procuracao = fabricaPJ.criarProcuracao();

    assertInstanceOf(ContratoPJ.class, contrato);
    assertInstanceOf(ProcuracaoPJ.class, procuracao);
}

@Test
public void testeIntegracaoPF() {

    FabricaMethodFabrica fabrica = FabricaMethodFabrica.getInstancia();

    FabricaAbstrata fabricaPF = fabrica.criarFabrica("PF");

    Contrato contrato = fabricaPF.criarContrato();
    Procuracao procuracao = fabricaPF.criarProcuracao();

    assertEquals("Contrato PF", contrato.obterDescricao());
    assertEquals("Procuracao PF", procuracao.obterDescricao());
}

@Test
public void testeIntegracaoPJ() {

    FabricaMethodFabrica fabrica = FabricaMethodFabrica.getInstancia();

    FabricaAbstrata fabricaPJ = fabrica.criarFabrica("PJ");

    Contrato contrato = fabricaPJ.criarContrato();
    Procuracao procuracao = fabricaPJ.criarProcuracao();

    assertEquals("Contrato PJ", contrato.obterDescricao());
    assertEquals("Procuracao PJ", procuracao.obterDescricao());
}

}

