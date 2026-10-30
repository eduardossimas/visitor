package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SUVTest {

    @Test
    void deveRetornarPotenciaSUVCombustao() {
        Motor motor = new MotorCombustao();
        Veiculo suv = new SUV(100);
        suv.setMotor(motor);
        assertEquals(120f, suv.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSUVEletrico() {
        Motor motor = new MotorEletrico();
        Veiculo suv = new SUV(100);
        suv.setMotor(motor);
        assertEquals(130f, suv.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSUVEHibrido() {
        Motor motor = new MotorHibrido();
        Veiculo suv = new SUV(100);
        suv.setMotor(motor);
        assertEquals(140f, suv.calcularPotencia(), 0.01f);
    }

}