import random

class OTPGenerator:
    def __init__(self, length=6):
        self.length = length

    def generate_otp(self):
        otp = ''.join(random.choices('0123456789', k=self.length))
        return otp

class OTPVerifier:
    def verify_otp(self, user_input, otp):
        return user_input == otp

def main():
    otp_generator = OTPGenerator()
    otp_verifier = OTPVerifier()

    # Generate OTP
    otp = otp_generator.generate_otp()
    print("sudhanshu: Generated OTP:", otp)

    # Simulate user input
    user_input = input("Enter OTP for verification: ")

    # Verify OTP
    if otp_verifier.verify_otp(user_input, otp):
        print("OTP Verification Successful!")
    else:
        print("OTP Verification Failed!")

if __name__ == "__main__":
    main()
