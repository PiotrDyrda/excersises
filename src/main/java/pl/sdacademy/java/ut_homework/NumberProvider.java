package pl.sdacademy.java.ut_homework;

/**
 * This interface is specifying number providers. It will provide some number
 */
public interface NumberProvider {
    Integer provideInteger();
    Long provideLong();
    Float provideFloat();
    Double provideDouble();
}
