# BankingApplication
Java Project that performs basic banking actions.

Description:
You are supposed to implement the requirements provided below by creating a cli application in a programming language you choose.
You will be building a banking application. The user will be able to perform the following actions along with the needed Input.
| Action          | Description                                                            | Code     | Inputs Needed | Sample command       |
|-----------------|------------------------------------------------------------------------|----------|---------------|----------------------|
| Create Account  | Should create a new Account with Zero Balance                          | CREATE   | code, name    | CREATE ACC001 KELP   |
| Deposit Amount  | Should add the amount to existing balance                              | DEPOSIT  | code, amount  | DEPOSIT ACC001 10000 |
| Withdraw Amount | Should reduce the amount from existing balance                         | WITHDRAW | code, amount  | WITHDRAW ACC001 1000 |
| Show Balance    | Show the current balance of the account along with Name of the account | BALANCE  | code          | BALANCE ACC001       |

**Sample I/0**

`Input:
CREATE ACC001 KELP
DEPOSIT ACC001 10000
WITHDRAW ACC001 1000
CREATE ACC002 FVTPL
DEPOSIT ACC002 10000
WITHDRAW ACC002 2000
BALANCE ACC002
BALANCE ACC001`

`Output:
FVTPL 8000
KELP 9000`
