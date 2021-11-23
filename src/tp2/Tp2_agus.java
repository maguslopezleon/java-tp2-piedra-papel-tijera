package tp2;

import javax.swing.*;

class Tp2 {

	public static void main(String[] args) {

		int humano, maquina, volverJugar;
		final int piedra = 1, papel = 2, tijera = 3;

		JOptionPane.showMessageDialog(null, "", "Piedra, Papel o Tijera", JOptionPane.INFORMATION_MESSAGE,
				new ImageIcon(Tp2.class.getResource("/img/ojo.jpg")));

		JOptionPane.showMessageDialog(null, "Bienvenido al juego! Leé con atención la imagen para aprender las reglas",
				"Piedra, Papel o Tijera", JOptionPane.INFORMATION_MESSAGE,
				new ImageIcon(Tp2.class.getResource("/img/reglas.jpg")));

		do {

			humano = (int) (Math.random() * 3 + 1);

			if (humano == piedra) {
				JOptionPane.showMessageDialog(null, "Tu tirada fue: piedra ", "Piedra, Papel o Tijera",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/piedra.png")));
			} else if (humano == papel) {
				JOptionPane.showMessageDialog(null, "Tu tirada fue: papel ", "Piedra, Papel o Tijera",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/papel.png")));
			} else {
				JOptionPane.showMessageDialog(null, "Tu tirada fue: tijera ", "Piedra, Papel o Tijera",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/tijera.png")));
			}

			JOptionPane.showMessageDialog(null, "Ahora es el turno de la máquina... 3, 2, 1");

			maquina = (int) (Math.random() * 3 + 1);

			if (maquina == piedra) {
				JOptionPane.showMessageDialog(null, "La tirada de la máquina fue: piedra ", "Piedra, Papel o Tijera",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/piedra.png")));
			} else if (maquina == papel) {
				JOptionPane.showMessageDialog(null, "La tirada de la máquina fue: papel ", "Piedra, Papel o Tijera",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/papel.png")));
			} else {
				JOptionPane.showMessageDialog(null, "La tirada de la máquina fue: tijera ", "Piedra, Papel o Tijera",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Tp2.class.getResource("/img/tijera.png")));
			}

			switch (maquina) {
			case piedra:

				if (humano == piedra) {
					JOptionPane.showMessageDialog(null, "Empataste contra la máquina!");
				} else if (humano == papel) {
					JOptionPane.showMessageDialog(null, "Ganaste contra la máquina!");
				} else {
					JOptionPane.showMessageDialog(null, "Perdiste contra la máquina!");
				}
				break;

			case papel:

				if (humano == papel) {
					JOptionPane.showMessageDialog(null, "Empataste contra la máquina!");
				} else if (humano == tijera) {
					JOptionPane.showMessageDialog(null, "Ganaste contra la máquina!");
				} else {
					JOptionPane.showMessageDialog(null, "Perdiste contra la máquina!");
				}
				break;

			case tijera:
				if (humano == tijera) {
					JOptionPane.showMessageDialog(null, "Empataste contra la máquina!");
				} else if (humano == piedra) {
					JOptionPane.showMessageDialog(null, "Ganaste contra la máquina!");
				} else {
					JOptionPane.showMessageDialog(null, "Perdiste contra la máquina!");
				}
				break;
			}

			volverJugar = JOptionPane.showConfirmDialog(null, "Querés volver a jugar?");

		} while (volverJugar == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "Gracias por jugar conmigo!", "Piedra, Papel o Tijera",
				JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Tp2.class.getResource("/img/gracias.jpg")));

	}

}
