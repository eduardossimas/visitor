package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroPasseioTest {

    @Test
    void deveRetornarPotenciaCarroPasseioCombustao() {
        Motor motor = new MotorCombustao();
        Veiculo carroPasseio = new CarroPasseio(100);
        carroPasseio.setMotor(motor);
        assertEquals(120f, carroPasseio.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaCarroPasseioEletrico() {
        Motor motor = new MotorEletrico();
        Veiculo carroPasseio = new CarroPasseio(100);
        carroPasseio.setMotor(motor);
        assertEquals(130f, carroPasseio.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaCarroPasseioHibrido() {
        Motor motor = new MotorHibrido();
        Veiculo carroPasseio = new CarroPasseio(100);
        carroPasseio.setMotor(motor);
        assertEquals(140f, carroPasseio.calcularPotencia(), 0.01f);
    }

}