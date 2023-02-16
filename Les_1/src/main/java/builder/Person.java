package builder;

public class Person {

        private String lastName;
        private String firstName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        private Person() {}

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getCountry() {
            return country;
        }

        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static Builder newBuilder() {
            return new Person().new Builder();
        }

        public class Builder {

            private Builder() {}

            public Builder setLastName(String lastName) {
                Person.this.lastName = lastName;
                return this;
            }

            public Builder setFirstName(String firstName) {
                Person.this.firstName = firstName;
                return this;
            }

            public Builder setMiddleName(String middleName) {
                Person.this.middleName = middleName;
                return this;
            }


            public Builder setCountry(String country) {
                Person.this.country = country;
                return this;
            }

            public Builder setAddress(String address) {
                Person.this.address = address;
                return this;
            }
            public Builder setPhone(String phone) {
                Person.this.phone = phone;
                return this;
            }

            public Builder setAge(int age) {
                Person.this.age = age;
                return this;
            }

            public Builder setGender(String gender) {
                Person.this.gender = gender;
                return this;
            }

            public Person build() {
                return Person.this;
            }
        }
    }

