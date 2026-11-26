# Payments Modernization Hub

A Java reference catalogue of the building blocks inside a modern bank payment hub. It is organised the way a real hub is: channels and APIs, orchestration, rails, rules, risk, ledger and settlement. The repo also bundles the ISO 20022 schemas the hub works with.

Each class is small and self-contained, so you can read how a single concern works (an idempotency check, a cut-off rule, a Zelle alias check) without wading through a framework.

## What's inside

| Area | Package | Examples |
|------|---------|----------|
| Core processing | `core` | Payment engine, orchestrator, router, idempotency, replay detection, channel normalization |
| ISO 20022 | `iso20022` | pacs.008 parsing, pacs.002 status building, camt.054 parsing |
| Real-time rails | `rtp`, `zelle` | RTP limits, fees, timeouts and messages; Zelle enrollment, alias validation, limits and risk |
| Rules | `rules` | Rule engine, fee rules, cut-off times, country risk |
| Risk and security | `security`, `validation` | Fraud detection, velocity checks, device fingerprint, geo-IP, sanctions, IBAN and schema validation |
| Ledger and settlement | `ledger`, `settlement`, `clearing` | Posting, reconciliation, snapshots, netting, liquidity, clearing windows |
| Integration | `api`, `kafka`, `notifications` | Payment, inquiry, admin and health endpoints; topic and partition helpers; email and SMS notices |
| Platform | `auth`, `crypto`, `config`, `model`, `utils`, `simulation` | JWT and API keys, hashing and signatures, cutover flags and region config, load simulation |

## ISO 20022 schemas

The `xsd/` folder holds 35 ISO 20022 message schemas used across payment initiation, exceptions and investigations, and account switching:

- `pain`: 001, 002, 007, 008
- `camt`: 026 to 039, 055 to 059, 087
- `acmt`: 027 to 037

## Project layout

```text
payments-modernization-hub/
├── src/modernization/   Java source, one package per area
├── src/resources/       application.yml (ports, settlement window, fraud threshold, Kafka topics)
├── xsd/                 ISO 20022 schemas
├── diagrams/            Solution and orchestration diagrams
└── docs/                References to official standards
```

## Getting started

```bash
git clone https://github.com/RahulAutade2288/payments-modernization-hub.git
```

Open the project in IntelliJ IDEA or VS Code with Java 17 or later. The classes use only the Java standard library, so there is nothing to install.

## Roadmap

- Spring Boot wrappers to expose the payment and inquiry APIs over REST
- Real Kafka producers and consumers for clearing and settlement events
- XSD-based validation of inbound pacs, pain and camt messages
- End-to-end flow simulations from initiation to notification
- Unit and integration tests

## References

Official standards and rail documentation are linked in [docs/References.md](docs/References.md).

## Disclaimer

This is a learning and reference project, not production payment software.

## Author

**Rahul Autade**, Payments Modernization & Implementation Leader
[rahulautade2288.github.io](https://rahulautade2288.github.io/) · [LinkedIn](https://www.linkedin.com/in/rahul-autade/)
