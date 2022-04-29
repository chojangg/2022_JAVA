package TextInheritance11;

public class TV implements Sound {
	private int SndLevel;
	public TV() {
		SndLevel = 0;
	}
	
	@Override
	public void SoundUp(int level) {
		SndLevel += level;
		System.out.println(level + " TV º¼·ýÁõ°¡ ");
	}

	@Override
	public void SoundDown(int level) {
		SndLevel -= level;
		if(SndLevel < 0) SndLevel = 0;
	}

}
