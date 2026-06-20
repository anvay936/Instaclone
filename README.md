# InstaClone

Production-grade social media backend engineering project inspired by Instagram and TikTok.

This project is being built to deeply learn:

* Backend Engineering
* Distributed Systems
* Scalability
* Reliability Engineering
* Event-Driven Architecture
* Infrastructure
* Performance Engineering
* Realtime Systems

The goal is NOT to build a tutorial CRUD app.

The goal is to engineer a system that evolves like a real production platform used by millions of users.

---

# Vision

Build a scalable social media platform that gradually evolves from:

Simple Monolith
→ Modular Monolith
→ Event Driven Backend
→ Distributed Services
→ Scalable Infrastructure

This project is intentionally designed to simulate engineering growth similar to systems built at companies like:

* Google
* Stripe
* Uber
* Rubrik
* Meta
* Cloudflare

---

# Planned Features

## User System

* Authentication
* JWT + Refresh Tokens
* OAuth
* Profiles
* Follow System
* Privacy Controls

---

## Posts

* Image/Video Uploads
* Captions
* Hashtags
* Likes
* Comments
* Saves

---

## Feed System

* Home Feed
* Following Feed
* Explore Feed
* Reels Feed

---

## Messaging

* Realtime Chat
* Typing Indicators
* Read Receipts

---

## Notifications

* Likes
* Comments
* Follows
* Realtime Notifications

---

## Search

* User Search
* Hashtag Search
* Post Search

---

# Tech Stack

| Area            | Technology                   |
| --------------- | ---------------------------- |
| Backend         | Java + Spring Boot           |
| Database        | PostgreSQL                   |
| Cache           | Redis                        |
| Event Streaming | Kafka                        |
| Search          | OpenSearch                   |
| Storage         | S3 Compatible Object Storage |
| Frontend        | React                        |
| Realtime        | WebSockets                   |
| Infrastructure  | Docker                       |
| Orchestration   | Kubernetes (later)           |
| Monitoring      | Prometheus + Grafana         |

---

# Engineering Philosophy

## Start Simple

The project starts as a modular monolith.

Complexity is introduced gradually:

* async systems
* event-driven architecture
* distributed services
* advanced infrastructure

No premature optimization.

---

## Build Like Production

Every feature should consider:

* scalability
* reliability
* observability
* security
* performance

---

## Learn Internals

The purpose is to understand:

* WHY Redis helps
* WHY Kafka exists
* WHY caching matters
* WHY distributed systems become necessary

Not just use technologies blindly.

---

# Architecture Evolution

## Phase 1 — Modular Monolith

* REST APIs
* Layered Architecture
* DTOs
* Validation
* Exception Handling
* PostgreSQL Integration

---

## Phase 2 — Event Driven Backend

* Kafka
* Async Processing
* Background Workers
* Notification Pipelines
* Feed Fanout

---

## Phase 3 — Distributed Services

* Service Decomposition
* Independent Scaling
* Inter-Service Communication
* Observability

---

## Phase 4 — Advanced Infrastructure

* Kubernetes
* Autoscaling
* Recommendation Systems
* DB Partitioning/Sharding
* Multi-Region Concepts

---

# Backend Structure

Each module follows:

controller
service
repository
dto
entity

Example:

com.instaclone
├── auth
├── users
├── posts
├── feed
├── common

---

# Development Structure

Project planning follows:

EPIC
└── STORY
├── Goal
├── Engineering Concepts
├── Tasks
├── Acceptance Criteria
└── Scaling Notes

This structure intentionally mimics real engineering teams.

---

# Current Epics

## EPIC 1 — Core Backend Foundation

* clean architecture
* REST APIs
* DTOs
* validation
* exception handling
* CRUD
* pagination
* timeline basics

---

## EPIC 2 — Database & Persistence Layer

* PostgreSQL integration
* JPA
* repositories
* indexing
* migrations
* query optimization

---

# Long-Term Learning Goals

This project is intended to build deep understanding of:

* Backend Architecture
* Distributed Systems
* Event Driven Systems
* Database Scaling
* Caching
* Feed Generation
* Realtime Communication
* Infrastructure
* Reliability Engineering
* Performance Engineering

---

# Important Rule

The system should evolve naturally:

Simple
→ Stable
→ Scalable
→ Distributed
→ Optimized

The focus is engineering depth, not fast feature delivery.

---

# Status

🚧 Currently in active development.

Initial focus:

* backend foundations
* architecture
* persistence layer
* API correctness
* scalability preparation
