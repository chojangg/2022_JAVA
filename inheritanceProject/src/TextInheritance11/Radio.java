package TextInheritance11;

public class Radio implements Sound {
	private int SndLevel;
	public Radio() {
		SndLevel = 0;
	}
	
	@Override
	public void SoundUp(int level) {
		SndLevel += level;
		System.out.println(level + " 라디오 볼륨증가 ");
	}

	@Override
	public void SoundDown(int level) {
		SndLevel -= level;
		if(SndLevel < 0) SndLevel = 0;
	}

}
