package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Represents a Person's Contract End Date in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidDate(String)}
 */
public abstract class ContractEndDate {

    public String value;

    private static final ContractEndDate EMPTY_CONTRACT_END_DATE = new EmptyContractEndDate();

    public static final String MESSAGE_CONSTRAINTS =
            "Contract End Date should only contain numeric characters and dashes in the format 'YYYY-MM-DD', and it"
                    + " should not be blank";

    public static ContractEndDate empty() {
        return EMPTY_CONTRACT_END_DATE;
    }

    public static ContractEndDate of(String date) {
        return new FilledContractEndDate(date);
    }

    /**
     * Returns true if a given string is a valid date.
     */
    public static boolean isValidDate(String test) {
        try {
            LocalDate.parse(test);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    /**
     * Returns true if a given string is a valid date.
     */
    public static LocalDate convertStringToDate(String date) {
        return LocalDate.parse(date);
    }

    static class EmptyContractEndDate extends ContractEndDate {

        /**
         * Constructs an empty {@code ContractEndDate}.
         */
        public EmptyContractEndDate() {
            value = "";
        }

        @Override
        public boolean equals(Object t) {
            return this == t;
        }

        @Override
        public String toString() {
            return "";
        }
    }

    static class FilledContractEndDate extends ContractEndDate {

        public final LocalDate contractEndDate;

        /**
         * Constructs a {@code ContractEndDate}.
         *
         * @param date A valid date.
         */
        public FilledContractEndDate(String date) {
            requireNonNull(date);
            checkArgument(isValidDate(date), MESSAGE_CONSTRAINTS);
            this.contractEndDate = convertStringToDate(date);
            this.value = date;
        }

        @Override
        public String toString() {
            return contractEndDate.toString();
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }

            // instanceof handles nulls
            if (!(other instanceof FilledContractEndDate)) {
                return false;
            }

            FilledContractEndDate otherContractEndDate = (FilledContractEndDate) other;
            return contractEndDate.equals(otherContractEndDate.contractEndDate);
        }

        @Override
        public int hashCode() {
            return contractEndDate.hashCode();
        }
    }
}
