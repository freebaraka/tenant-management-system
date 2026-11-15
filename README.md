# Tenant Management System

An Android application for landlords to register tenants, record rent, view tenant details, and call a tenant from the app.

## Features

- Register and log in
- Dashboard showing the number of tenants and total rent
- Add tenants with their name, phone number, and rent
- View tenants saved on the device
- Open the phone dialer for a tenant
- Navigation drawer, menu actions, and logout

## Architecture

The project is separated into two main parts:

- `ui/` contains the activities, fragments, and `TenantViewModel`.
- `data/` contains the Room entity, DAO, database, and repository.

The screens observe `LiveData` from `TenantViewModel`. The ViewModel uses `TenantRepository`, which reads and writes tenant records through Room. The data layer does not depend on the UI layer.

## Team

| Stage | Member | Admission number | Pull request |
|---|---|---|---|
| 1. Project setup | Onserio Baraka Osumo | 191627 | Initial project setup |
| 2. ViewModel | Bethuel Kilonzo | 191636 | [#1](https://github.com/freebaraka/tenant-management-system/pull/1) |
| 3. Room database | Ian Simiyu | 189808 | [#3](https://github.com/freebaraka/tenant-management-system/pull/3) |
| 4. Screens | Daniella Wanjohi | 176676 | [#2](https://github.com/freebaraka/tenant-management-system/pull/2) |
| 5. Data integration | Kamure Beyonce Kabura | 179486 | [#4](https://github.com/freebaraka/tenant-management-system/pull/4) |
| 6. Release | Brian Koech | 189722 | To be added |

## Download

The signed APK will be attached to the GitHub `v1.0` release after the release stage is completed.
