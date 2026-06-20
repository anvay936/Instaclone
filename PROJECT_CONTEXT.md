# PROJECT_CONTEXT.md

# InstaClone — Production Grade Backend Engineering Project

## Project Vision

This project is NOT a tutorial Instagram clone.

The goal is to build a production-grade social media platform inspired by Instagram and TikTok that teaches:

* Backend Engineering
* Distributed Systems
* Scalability
* Reliability Engineering
* Infrastructure
* Event-Driven Architecture
* Performance Engineering
* Realtime Systems
* Database Scaling
* Production Architecture

The long-term goal is to reach engineering depth required for top backend/distributed systems companies such as:

* Rubrik
* Stripe
* Google
* Uber
* Meta
* Datadog
* Cloudflare

The project should evolve like a real production system:

* Simple
* Stable
* Scalable
* Distributed
* Optimized

Avoid premature complexity.

---

# Core Engineering Philosophy

## 1. Start Simple

Begin with:

* Modular monolith
* Clean architecture
* Strong fundamentals

DO NOT start with:

* Microservices
* Kubernetes
* Complex distributed systems

Those will be introduced gradually.

---

## 2. Learn Internals

Understand:

* WHY Redis exists
* WHY Kafka exists
* WHY caching matters
* WHY sharding becomes necessary
* WHY async processing improves scalability

Avoid tutorial-style copy-paste engineering.

---

## 3. Build Like Production

Every system should consider:

* scalability
* reliability
* retries
* failures
* observability
* security
* performance

---

# Planned Architecture Evolution

## Phase 1 — Modular Monolith

Architecture:

Frontend
↓
Spring Boot Backend
↓
PostgreSQL
Redis
Object Storage

Focus:

* clean architecture
* APIs
* DB modeling
* authentication
* media uploads
* validation
* exception handling

---

## Phase 2 — Event Driven Backend

Introduce:

* async processing
* Kafka
* event-driven architecture
* notifications
* feed generation

Focus:

* queues
* eventual consistency
* background workers
* scalable processing

---

## Phase 3 — Distributed Services

Split into services:

* Auth Service
* User Service
* Post Service
* Feed Service
* Media Service
* Notification Service
* Messaging Service

Focus:

* service communication
* observability
* reliability
* independent scaling

---

## Phase 4 — Advanced Infrastructure

Introduce:

* Kubernetes
* autoscaling
* advanced caching
* recommendation systems
* DB partitioning/sharding
* multi-region concepts

Focus:

* staff-level distributed systems engineering

---

# Core Features Planned

## User System

* signup/login
* JWT auth
* OAuth
* refresh tokens
* profiles
* follow system
* privacy settings

---

## Posts

* image/video uploads
* captions
* hashtags
* likes
* comments
* saves

---

## Feed

* home feed
* following feed
* explore feed
* reels feed

---

## Messaging

* realtime chat
* typing indicators
* read receipts

---

## Notifications

* likes
* comments
* follows
* realtime notifications

---

## Search

* user search
* hashtag search
* post search

---

# Tech Stack

## Backend

* Java
* Spring Boot

## Database

* PostgreSQL

## Cache

* Redis

## Messaging/Event Streaming

* Kafka

## Search

* OpenSearch

## Storage

* S3 compatible object storage

## Frontend

* React

## Realtime

* WebSockets

## Infrastructure

* Docker
* Kubernetes (later)

## Observability

* Prometheus
* Grafana

---

# Backend Architecture Rules

Use modular monolith initially.

Each module should contain:

* controller
* service
* repository
* dto
* entity

Example:

com.instaclone
├── auth
├── users
├── posts
├── feed
├── common

Inside each module:

* controller
* service
* repository
* dto
* entity

---

# API Philosophy

## Use RESTful APIs

Examples:

POST /posts
GET /posts
PUT /posts/{id}
DELETE /posts/{id}

---

## Use DTOs

Never expose entities directly.

Use:

* Request DTOs
* Response DTOs

---

## Structured Errors

All APIs should return consistent error responses.

Example:

{
"timestamp": "...",
"status": 400,
"error": "Validation Failed",
"message": "Content cannot be blank"
}

---

# Database Philosophy

Use PostgreSQL as primary database.

Focus on:

* normalization initially
* indexing
* pagination
* query optimization

Later:

* partitioning
* replication
* sharding

---

# Caching Philosophy

Use Redis for:

* sessions
* feed caching
* hot posts
* rate limiting

Learn:

* cache-aside pattern
* invalidation
* TTLs

---

# Event Driven Architecture

Kafka will be introduced later.

Planned events:

* post_created
* post_updated
* user_followed
* notification_created
* reel_viewed

Used for:

* notifications
* analytics
* feed fanout
* async processing

---

# Media Pipeline Vision

Upload Flow:

Upload
→ Validation
→ Compression
→ Thumbnail generation
→ Storage
→ CDN delivery

Concepts to learn:

* async jobs
* retries
* streaming
* chunk uploads

---

# Feed System Vision

This is one of the most important systems.

Planned concepts:

* fanout-on-write
* fanout-on-read
* ranking
* caching
* celebrity problem

---

# Realtime System Vision

Use WebSockets for:

* chat
* online status
* notifications

Learn:

* persistent connections
* websocket scaling
* pub/sub systems

---

# Reliability Engineering Goals

Every system should eventually support:

* retries
* timeouts
* graceful degradation
* circuit breakers
* rate limiting
* idempotency

---

# Observability Goals

Track:

* request latency
* DB latency
* cache hit rate
* queue lag
* API errors

Use:

* Prometheus
* Grafana

---

# Security Goals

Implement:

* JWT auth
* password hashing
* input validation
* rate limiting
* secure uploads

Later:

* RBAC
* secret management
* abuse prevention

---

# Deployment Plan

Initially:

* local Docker Compose

Later:

* cloud deployment
* CI/CD
* Kubernetes
* autoscaling

---

# Performance Goals

Focus on:

* low DB queries
* efficient caching
* fast APIs
* low p95 latency

Learn:

* profiling
* benchmarking
* load testing
* query optimization

---

# Project Development Structure

Project planning follows:

EPIC
└── STORY
├── Goal
├── Engineering Concepts
├── Tasks
├── Acceptance Criteria
└── Scaling Notes

This structure is intentionally designed to simulate real engineering teams.

---

# Current Planned Epics

## EPIC 1 — Core Backend Foundation

Focus:

* clean architecture
* REST APIs
* DTOs
* validation
* exception handling
* repository layer
* CRUD
* pagination
* timeline basics

---

## EPIC 2 — Database & Persistence Layer

Focus:

* PostgreSQL integration
* JPA entities
* repositories
* pagination
* sorting
* indexing
* migrations
* query optimization

---

# Important Engineering Rule

DO NOT optimize prematurely.

Progression should always be:

Simple
→ Stable
→ Scalable
→ Distributed
→ Optimized

This project exists primarily for learning deep backend and distributed systems engineering, not for shipping features quickly.

---

# Final Goal

The final system should resemble a simplified combination of:

* Instagram
* TikTok
* Netflix
* Discord
* Uber
* Stripe

in terms of engineering concepts and backend architecture depth.

---

# Current AI Context

## Repository Location

The active project repository is:

`/home/sawai/projects/InstaClone/instaclone`

The outer `/home/sawai/projects/InstaClone` directory contains the nested `instaclone` repository.

For shell commands, use this as the working directory:

```bash
cd /home/sawai/projects/InstaClone/instaclone
```

When running from Windows/PowerShell through WSL, use:

```powershell
wsl.exe -d Ubuntu --cd /home/sawai/projects/InstaClone/instaclone -- <command>
```

## Current Implementation State

The project is currently working on:

* PHASE 1
* EPIC 1 — Core Backend Foundation
* STORY 2 — Create Post Entity & Basic APIs is implemented
* Next planned story: STORY 3 — Add DTO Layer

The current Spring Boot root package is:

`com.core.instaclone`

Even though some planning docs use `com.instaclone` as an example, the code and Maven coordinates currently use `com.core.instaclone`. Keep this consistent unless the user explicitly decides to rename the root package.

The application entry point is:

`src/main/java/com/core/instaclone/InstacloneApplication.java`

The context-load test is:

`src/test/java/com/core/instaclone/InstacloneApplicationTests.java`

## Story 1 Architecture Target

Story 1 was about clean architecture scaffolding only. The project has since moved into Story 2 and added the first real Post APIs.

Target package layout:

```text
com.core.instaclone
  auth
    controller
    service
    repository
    dto
    entity
  users
    controller
    service
    repository
    dto
    entity
  posts
    controller
    service
    repository
    dto
    entity
  feed
    controller
    service
    repository
    dto
    entity
  common
    exception
    config
    util
    constants
```

The module/layer names above should be Java packages/directories. Avoid lowercase Java class placeholders such as `controller.java`, `service.java`, or `dto.java`.

Important Git note: empty package directories are not tracked by Git. If the architecture scaffold must be visible in version control before real classes exist, add small package marker classes or wait until Story 2 creates real classes.

## Story 2 Implementation State

Story 2 target:

* Create `Post` entity with `id`, `content`, `createdAt`, and `updatedAt`.
* Create `PostController`.
* Add `POST /posts` and `GET /posts`.
* Create `PostService` with `createPost()` and `getAllPosts()`.
* Use an in-memory list temporarily.
* Return JSON responses, not plain strings.
* Ensure timestamps are visible in JSON.

Current Story 2 files:

* `src/main/java/com/core/instaclone/posts/entity/Post.java`
* `src/main/java/com/core/instaclone/posts/controller/PostController.java`
* `src/main/java/com/core/instaclone/posts/service/PostService.java`

Current behavior:

* `POST /posts` accepts a JSON body such as `{ "content": "hello" }`.
* `POST /posts` returns the created `Post` object as JSON.
* `GET /posts` returns the in-memory list as JSON.
* `PostController` delegates to `PostService`.
* `PostService` owns the temporary in-memory store and id counter.
* `Post` has a no-args constructor for Jackson request-body deserialization.
* `Post` exposes getters for `id`, `content`, `createdAt`, and `updatedAt`, so those fields can appear in JSON.

Story 3 should introduce DTOs. Do not require DTOs when evaluating Story 2.

## Git Notes

The `.gitignore` currently ignores `target/`, `.idea/`, editor metadata, and common build outputs. Consider tracking `.mvn/wrapper/maven-wrapper.jar` if the Maven wrapper should work on fresh clones without relying on a locally installed Maven.

The `.gitattributes` file controls Git handling rules such as line endings and binary/text behavior. It is not an ignore file.

## Current Verification

As of this context update:

* Windows PowerShell `.\mvnw.cmd test` may fail with the current wrapper script.
* WSL verification works with: `wsl.exe -d Ubuntu --cd /home/sawai/projects/InstaClone/instaclone -- ./mvnw test`
* The latest WSL `./mvnw test` run passes.
* The test suite contains one Spring context-load test.
* Story 2 is considered complete at the code/acceptance-criteria level, though there are not yet endpoint-level tests.
